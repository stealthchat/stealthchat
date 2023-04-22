<script setup>
import { ref } from 'vue'

const theme = ref('dark')

function switchTheme() {
  theme.value = theme.value === 'light' ? 'dark' : 'light'
}
</script>

<template>
  <v-app :theme="theme">
    <v-app-bar class="pl-5">
      <v-icon icon="mdi-menu" @click="drawer = !drawer"></v-icon>
      <v-spacer></v-spacer>
      <v-btn
        :prepend-icon="
          theme === 'light' ? 'mdi-weather-sunny' : 'mdi-weather-night'
        "
        @click="switchTheme()"
        >{{ theme === 'light' ? 'Dark' : 'Light' }}</v-btn
      >
    </v-app-bar>
    <v-navigation-drawer app v-model="drawer" temporary floating>
      <NavigationDrawer />
    </v-navigation-drawer>
    <v-main>
      <router-view />
    </v-main>
  </v-app>
</template>

<script>
import NavigationDrawer from './components/core/NavigationDrawer.vue'

export default {
  name: 'App',
  components: {
    NavigationDrawer,
  },
  data: () => ({
    drawer: false,
    theme: 'darkTheme',
  }),
  methods: {},
}
</script>

<style scoped></style>
