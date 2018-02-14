package ftl

import ftl.cli.RefreshCommand
import ftl.cli.RunCommand
import picocli.CommandLine


@CommandLine.Command(
        name = "flank.jar\n",
        synopsisHeading = "",
        subcommands = [
            RunCommand::class,
            RefreshCommand::class
        ]
)
object Main : Runnable {
    override fun run() {
        if (version) {
            println("v0.2")
        } else {
            CommandLine.usage(Main, System.out);
        }
    }

    @CommandLine.Option(names = ["-v", "--version"], description = ["Prints the version"])
    var version = false

    @Throws(Exception::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val args2 = arrayOf("-v")
        CommandLine.run<Runnable>(Main, System.out, *args2)
    }
}
