document.addEventListener("DOMContentLoaded", () => {
    const formCloseBtn = document.querySelector(".form_close");
    const formContainer = document.querySelector(".form_container");

    formCloseBtn.addEventListener("click", () => {
        formContainer.style.display = "none"; // Hide the form on close
    });
});
