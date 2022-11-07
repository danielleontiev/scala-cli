package scala.cli.commands

import caseapp.*

// format: off
final case class SharedBspFileOptions(
  @Name("bspDir")
  @HelpMessage("Custom BSP configuration location")
  @Hidden
    bspDirectory: Option[String] = None,
  @Name("name")
  @HelpMessage("Name of BSP")
  @Hidden
    bspName: Option[String] = None
)
// format: on

object SharedBspFileOptions {
  implicit lazy val parser: Parser[SharedBspFileOptions] = Parser.derive
  implicit lazy val help: Help[SharedBspFileOptions]     = Help.derive
}
