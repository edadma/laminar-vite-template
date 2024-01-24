package io.guthub.edadma.laminar_vite_template

import com.raquo.laminar.api.L.{*, given}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

@js.native @JSImport("/laminar-logo-100px-rounded.png", JSImport.Default)
val laminarLogo: String = js.native

def App =
  div(
    a(
      href := "https://vitejs.dev",
      target := "_blank",
      img(src := "/vite.svg", className := "logo", alt := "Vite logo"),
    ),
    a(
      href := "https://laminar.dev",
      target := "_blank",
      img(src := laminarLogo, className := "logo", alt := "laminar logo"),
    ),
    h1("Hello Laminar!"),
    p(className := "read-the-docs", "Click on the Vite logo to learn more"),
  )
