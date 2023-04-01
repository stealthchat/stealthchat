<script setup></script>

<template>
  <v-container class="mt-5">
    <v-row>
      <v-col xl="6" lg="6" md="9" sm="9" xs="12" cols="12" class="mx-auto">
        <v-card class="rounded-lg elevation-8">
          <v-card-title class="text-center text-h4 font-weight-bold mt-5">
            Login - StormChat
          </v-card-title>
          <v-card-text class="mt-8">
            <v-row>
              <v-col xl="10" lg="19" md="10" sm="10" xs="12" class="mx-auto">
                <v-text-field placeholder="Username"></v-text-field>
              </v-col>
            </v-row>
            <v-row>
              <v-col xl="19" lg="10" md="10" sm="10" xs="12" class="mx-auto">
                <v-text-field placeholder="Password"></v-text-field>
              </v-col>
            </v-row>
            <v-row>
              <v-col cols="6" class="mx-auto text-right">
                <v-btn width="100px">Login</v-btn>
              </v-col>
              <v-col cols="6" class="mx-auto text-left">
                <v-btn width="100px" @click="register()">Register</v-btn>
              </v-col>
            </v-row>
          </v-card-text>
        </v-card>
      </v-col>
    </v-row>
  </v-container>
</template>

<script>
export default {
  name: 'LoginView',
  methods: {
    register() {
      this.$router.push({ name: 'Home' })
    },
  },
}
</script>

<style scoped></style>
