<template>
  <v-list density="compact">
    <v-list-item
      active-color="primary"
      :to="{ name: 'Chats' }"
      exact
      class="text-h6 pa-4"
    >
      Chats
    </v-list-item>
    <v-list-item
      active-color="primary"
      :to="{ name: 'Settings' }"
      exact
      class="text-h6 pa-4"
    >
      Settings
    </v-list-item>
  </v-list>
</template>

<script>
export default {
  name: 'NavigationDrawer',
  data: () => ({}),
}
</script>

<style></style>
