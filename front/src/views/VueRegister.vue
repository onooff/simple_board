<template>
  <div class="container pt-lg-md">
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
              <small>Or sign up with credentials</small>
            </div>
            <form role="form" class="offset-1 col-10">
              <b-input
                alternative
                class="mb-3"
                placeholder="Name"
                addon-left-icon="ni ni-hat-3"
              />
              <b-input
                alternative
                class="mb-3"
                placeholder="Email"
                addon-left-icon="ni ni-email-83"
              />
              <b-input
                alternative
                type="password"
                placeholder="Password"
                addon-left-icon="ni ni-lock-circle-open"
              />
              <div class="text-muted font-italic">
                <small
                  >password strength:
                  <span class="text-success font-weight-700">strong</span>
                </small>
              </div>
              <b-checkbox>
                <span
                  >I agree with the
                  <a href="#">Privacy Policy</a>
                </span>
              </b-checkbox>
              <div class="text-center">
                <b-button type="primary" class="my-4">Create account</b-button>
              </div>
            </form>
          </template>
        </b-card>
      </div>
    </div>
  </div>
</template>
<script>
export default {};
</script>
<style></style>
