<template>
  <div class="container pt-lg-md">
    <div class="mt-5"></div>
    <div class="row justify-content-center">
      <div class="col-lg-5">
        <b-card
          type="secondary"
          shadow
          header-classes="bg-white pb-5"
          body-classes="px-lg-5 py-lg-5"
          class="border-0"
          bg-variant="light"
        >
          <template>
            <div class="text-muted text-center mb-3">
              <small>Sign in with</small>
            </div>
            <div class="btn-wrapper text-center">
              <b-button class="pb-1 m-1" size="lg">
                <img slot="icon" src="img/icons/common/github.svg" />
                Github</b-button
              >
              <b-button class="pb-1 m-1" size="lg">
                <img slot="icon" src="img/icons/common/google.svg" />
                Google</b-button
              >
            </div>
          </template>
          <template>
            <div class="text-center text-muted mb-4">
              <small>Or sign in with credentials</small>
            </div>
            <b-form role="form" @submit="onSubmit" class="offset-1 col-10">
              <b-form-input
                alternative
                class="mb-3"
                placeholder="Id"
                v-model="userId"
              />
              <b-form-input
                alternative
                class="mb-3"
                type="password"
                placeholder="Password"
                v-model="password"
              />
              <b-form-checkbox> Remember me </b-form-checkbox>
              <div class="text-center">
                <b-button type="primary" class="md-4">Sign In</b-button>
              </div>
            </b-form>
          </template>
        </b-card>
        <div class="row mt-3">
          <div class="col-6 text-left">
            <a href="#" class="text">
              <small>Forgot password?</small>
            </a>
          </div>
          <div class="col-6 text-right">
            <a href="/register" class="text">
              <small>Create new account</small>
            </a>
          </div>
        </div>
      </div>
    </div>
  </div>

  <!-- <b-container>
    <b-row class="justify-content-md-center mt-4">
      <b-col col md="8">
        <b-card
          header="Sign in with"
          header-bg-variant="dark"
          header-text-variant="white"
        >
          <div class="btn-wrapper text-center">
            <button type="neutral">
              <img slot="icon" src="img/icons/common/github.svg" />
              Github
            </button>

            <button type="neutral">
              <img slot="icon" src="img/icons/common/google.svg" />
              Google
            </button>
          </div>
          <div class="text-center text-muted mb-4">
            <small>Or sign in with credentials</small>
          </div>
          <b-card-text>
            <b-form @submit="onSubmit">
              <b-form-group description="Enter Your username" label="Username">
                <b-form-input v-model="userId" required></b-form-input>
              </b-form-group>
              <b-form-group description="Enter your password" label="Password">
                <b-form-input
                  v-model="password"
                  type="password"
                  required
                ></b-form-input>
              </b-form-group>
              <b-form-group>
                <b-button
                  type="sbumit"
                  variant="outline-primary"
                  :disabled="acceptableSubmittion"
                  >Login</b-button
                >
              </b-form-group>
            </b-form>
          </b-card-text>
        </b-card>
      </b-col>
    </b-row>
  </b-container> -->
</template>

<script>
export default {
  data() {
    return {
      userId: "",
      password: "",
    };
  },
  methods: {
    onSubmit(event) {
      event.preventDefault();
      alert(this.userId + " " + this.password);
    },
  },
  computed: {
    //로그인 할때 빈칸있는지 확인
    acceptableSubmittion() {
      return this.userId.length > 0 && this.password.length > 0 ? false : true;
    },
  },
};
</script>

<style></style>
