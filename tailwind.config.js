/** @type {import('tailwindcss').Config} */
module.exports = {
  darkMode: 'class',
  content: ["./target/scala-3.3.1/laminar-vite-template-fastopt/**/*.{html,js}", "./public/**/*.html"],
  theme: {
    extend: {
      typography: {
        DEFAULT: {
          css: {
            maxWidth: '100%',
          },
        },
      }
    }
  },
  plugins: [
    require('@tailwindcss/typography'),
    require('@tailwindcss/forms')
  ],
}
