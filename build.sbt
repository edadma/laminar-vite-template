import org.scalajs.linker.interface.ModuleSplitStyle

ThisBuild / licenses += "ISC" -> url("https://opensource.org/licenses/ISC")
ThisBuild / versionScheme := Some("semver-spec")

publish / skip := true

lazy val root = project
  .in(file("."))
  .enablePlugins(ScalaJSPlugin)
  //  .enablePlugins(ScalablyTypedConverterPlugin)
  .settings(
    name := "laminar-vite-template",
    version := "0.0.1",
    scalaVersion := "3.3.1",
    organization := "io.github.edadma",
    githubOwner := "edadma",
    githubRepository := name.value,
    libraryDependencies += "com.raquo" %%% "laminar" % "16.0.0",
    libraryDependencies += "io.github.cquiroz" %%% "scala-java-time" % "2.5.0",
    libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.4.0",
    //    libraryDependencies += "com.lihaoyi" %%% "pprint" % "0.8.1",
    jsEnv := new org.scalajs.jsenv.nodejs.NodeJSEnv(),
    scalaJSUseMainModuleInitializer := true,
    scalaJSLinkerConfig ~= {
      _.withModuleKind(ModuleKind.ESModule)
        .withModuleSplitStyle(
          ModuleSplitStyle.SmallModulesFor(List("laminar_vite_template"))
        )
    },
    publishMavenStyle := true,
    Test / publishArtifact := false,
    licenses += "ISC" -> url("https://opensource.org/licenses/ISC"),
  )
