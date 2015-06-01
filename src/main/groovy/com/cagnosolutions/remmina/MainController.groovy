package com.cagnosolutions.remmina

import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
/**
 * Created by greg on 2/12/15.
 */

@CompileStatic
@RestController
class MainController {

	Map<String, Boolean> status

	@Autowired
	MainService mainService

	@RequestMapping(value = "/status",  method = RequestMethod.GET)
	Map<String, Boolean> status() {
		status = mainService.getStatus()
		status
	}
	
	@RequestMapping(value = "/loki", method = RequestMethod.POST)
	def connectLoki() {
		status = mainService.connectLoki()
	}

	@RequestMapping(value = "/heimdallr", method = RequestMethod.POST)
	def connectHeimdallr() {
		status = mainService.connectHeimdallr()
	}

	@RequestMapping(value = "/snotra", method = RequestMethod.POST)
	def connectSnotra() {
		status = mainService.connectSnotra()
	}

	@RequestMapping(value = "/apple", method = RequestMethod.POST)
	def connectApple() {
		status = mainService.connectApple()
	}

	@RequestMapping(value = "/athena", method = RequestMethod.POST)
	def connectAthena() {
		status = mainService.connectAthena()
	}

	@RequestMapping(value = "/disconnect", method = RequestMethod.POST)
	def disconnect() {
		status = mainService.disconnect()
	}
}
