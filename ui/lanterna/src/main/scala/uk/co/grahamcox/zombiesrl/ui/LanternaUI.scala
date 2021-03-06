package uk.co.grahamcox.zombiesrl.ui

import java.nio.charset.Charset

import com.googlecode.lanterna.TerminalFacade

/**
 * UI that makes use of Lanterna
 */
class LanternaUI extends UI {
  private val terminal = TerminalFacade.createTerminal(Charset.forName("UTF-8"))
  private val screen = TerminalFacade.createScreen(terminal)

  screen.startScreen()
  terminal.enterPrivateMode()

  /**
   * Stop the UI
   */
  def stop() = {
    terminal.exitPrivateMode()
    screen.stopScreen()
  }
}
