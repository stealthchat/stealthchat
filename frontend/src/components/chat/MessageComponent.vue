<template>
  <v-row
    class="d-flex justify-start"
    :class="{
      'd-flex': true,
      'justify-end': message.ownMessage,
      'align-left': message.ownMessage,
    }"
  >
    <v-col cols="5">
      <v-card
        :color="message.ownMessage ? 'secondary' : 'primary'"
        class="rounded-ts-xl rounded-te-xl rounded-be-xl pa-1"
      >
        <v-card-title class="text-white">{{ message.title }}</v-card-title>
        <v-card-text class="text-white">{{ message.text }}</v-card-text>
      </v-card>
    </v-col>
  </v-row>
</template>

<script>
export default {
  name: 'MessageComponent',
  props: {
    message: Object,
  },
  data: () => ({}),
}
</script>

<style></style>
