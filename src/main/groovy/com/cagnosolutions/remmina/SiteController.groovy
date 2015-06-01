package com.cagnosolutions.remmina

import groovy.transform.CompileStatic
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod


@CompileStatic
@Controller
class SiteController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	String index() {
		"index"
	}
}
