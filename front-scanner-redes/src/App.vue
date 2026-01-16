<script setup>
import { ref, onMounted, onUnmounted } from 'vue';


const redes = ref([]);
const cargando = ref(true);


const cargarConfiguracion = async () => {
  try {
    cargando.value = true;
    const response = await fetch('http://localhost:8080/configuracion-redes');
    if (response.ok) {
      redes.value = await response.json();
    }
  } catch (error) {
    console.error("Error al conectar con la API:", error);
  } finally {
    cargando.value = false;
  }
};

const estadoClase = (estado) => {
  switch (estado) {
    case 'CONNECTED':
      return 'bg-success';
    case 'AUTHFAIL':
      return 'bg-warning';
    case 'NOSIGNAL':
      return 'bg-danger';
    default:
      return 'bg-secondary';
  }
};
let intervalId = null;


onMounted(() => {
  cargarConfiguracion(); // llamada inicial

  intervalId = setInterval(() => {
    cargarConfiguracion();
  }, 20000); // 20 segundos
});
onUnmounted(() => {
  if (intervalId) {
    clearInterval(intervalId);
  }
});


</script>

<template>
  <div class="app-container">
    <header class="header">
      <h1>WiFi Network Status Monitor</h1>
    </header>

    <main class="content">
      <button class="btn-refresh" @click="cargarConfiguracion">
        Refresh Data
      </button>

      <div class="table-wrapper">
        <table class="network-table">
          <thead>
            <tr>
              <th>Network Name (SSID)</th>
              <th>Status</th>
              <th>Last Check Date</th>
            </tr>
          </thead>
          <tbody>
            <tr v-for="red in redes" :key="red.id">
              <td>{{ red.ssid }}</td>
              <td>
                <span :class="['badge', estadoClase(red.estado)]">
                  {{ red.estado }}
                </span>

              </td>
              <td>{{ red.fecha }}</td>
            </tr>
            <tr v-if="redes.length === 0 && !cargando">
              <td colspan="3" style="text-align: center;">No se encontraron redes configuradas.</td>
            </tr>
          </tbody>
        </table>
      </div>
    </main>
  </div>
</template>

<style scoped>

.app-container {
  font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
  color: #333;
  
}


.header {
  background-color: #9cd2f3;
  padding: 10px 25px;
  border-bottom: 1px solid #86b9d8;
}

.header h1 {
  margin: 0;
  font-size: 1.4rem;
  font-weight: 500;
}

.content {
  padding: 20px;
}


.btn-refresh {
  background-color: #f8f9fa;
  border: 1px solid #ced4da;
  padding: 6px 12px;
  border-radius: 4px;
  cursor: pointer;
  margin-bottom: 15px;
  font-size: 0.9rem;
}

.btn-refresh:hover {
  background-color: #e2e6ea;
}


.table-wrapper {
  border: 1px solid #e0e0e0;
  border-radius: 4px;
  overflow: hidden;
}

.network-table {
  width: 100%;
  border-collapse: collapse;
  background-color: #fff;
}

.network-table th {
  text-align: left;
  padding: 12px 15px;
  border-bottom: 2px solid #f0f0f0;
  font-size: 0.9rem;
  color: #555;
}

.network-table td {
  padding: 12px 15px;
  border-bottom: 1px solid #f0f0f0;
  font-size: 0.95rem;
}


.badge {
  display: inline-block;
  padding: 2px 10px;
  border-radius: 4px;
  font-size: 0.8rem;
  font-weight: bold;
  color: white;
  text-align: center;
  min-width: 50px;
}

.bg-success { background-color: #4caf50; } /* Verde */
.bg-warning { background-color: #ff9800; } /* Naranja */
.bg-danger  { background-color: #d32f2f; } /* Rojo */
.bg-secondary { background-color: #757575; } /* Fallback */

</style>