<template>
  <v-navigation-drawer absolute fixed>
    <v-list width="250px" density="compact">
      <v-list-item
        v-for="chat in chats"
        active-color="primary"
        :value="chat"
        :key="chat.title"
        class="text-h6 pa-4"
      >
        <span class="pa-2">{{ chat.title }}</span>
        <v-divider></v-divider>
      </v-list-item>
    </v-list>
  </v-navigation-drawer>
</template>

<script>
export default {
  data: () => ({
    chats: [
      {
        title: 'Test',
      },
      {
        title: 'Test',
      },
      {
        title: 'Test',
      },
    ],
  }),
}
</script>

<style></style>
