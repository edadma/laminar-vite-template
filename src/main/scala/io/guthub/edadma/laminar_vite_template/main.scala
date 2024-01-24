package io.guthub.edadma.laminar_vite_template

import com.raquo.laminar.api.L.{*, given}
import org.scalajs.dom

@main def run(): Unit = renderOnDomContentLoaded(dom.document.getElementById("app"), App)
