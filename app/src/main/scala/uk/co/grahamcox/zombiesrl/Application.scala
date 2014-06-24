package uk.co.grahamcox.zombiesrl

import org.eintr.loglady.Logging
import uk.co.grahamcox.zombiesrl.ui.LanternaUI

/**
 * The main application entry point
 */
object Application extends App with Logging {
  log.info("Starting ZombiesRL")
  val ui = new LanternaUI
  Thread.sleep(10000)
  ui.stop()
  log.info("Stopping ZombiesRL")
}
