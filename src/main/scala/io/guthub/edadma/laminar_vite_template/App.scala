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
      img(src := laminarLogo, className := "logo", alt := "Laminar logo"),
    ),
    h1("Hello Laminar!"),
    div(className := "card", counterButton),
    p(className := "read-the-docs", "Click on the Vite logo or the Laminar logo to learn more"),
  )

def counterButton =
  val counter = Var(0)

  button(
    typ := "button",
    "count is ",
    child.text <-- counter,
    onClick --> { _ => counter.update(_ + 1) },
  )
