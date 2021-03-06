package com.cagnosolutions.remmina
import groovy.transform.CompileStatic
import org.springframework.stereotype.Service
/**
 * Created by greg on 3/9/15.
 */

@CompileStatic
@Service
class MainService {

	Boolean loki = false
	Boolean heimdallr = false
	Boolean snotra = false
	Boolean athena = false
	Boolean apple = false
	Boolean thor = false

	Map<String, Boolean> connectLoki() {
		executeCommand("remmina -c /home/athena/.remmina/loki.remmina")
		heimdallr = false
		snotra = false
		athena = false
		apple = false
		thor = false
		loki = true
		return getStatus()
	}

	Map<String, Boolean> connectHeimdallr() {
		executeCommand("remmina -c /home/athena/.remmina/heimdallr.remmina")
		snotra = false
		loki = false
		athena = false
		apple = false
		thor = false
		heimdallr = true
		return getStatus()
	}

	Map<String, Boolean> connectSnotra() {
		executeCommand("remmina -c /home/athena/.remmina/snotra.remmina")
		heimdallr = false
		loki = false
		athena = false
		apple = false
		thor = false
		snotra = true
		return getStatus()
	}

	Map<String, Boolean> connectAthena() {
		executeCommand("remmina -c /home/athena/.remmina/athena.remmina")
		heimdallr = false
		loki = false
		snotra = false
		apple = false
		thor = false
		athena = true
		return getStatus()
	}

	Map<String, Boolean> connectApple() {
		executeCommand("remmina -c /home/athena/.remmina/apple.remmina")
		heimdallr = false
		loki = false
		snotra = false
		athena = false
		thor = false
		apple = true
		return getStatus()
	}

	Map<String, Boolean> connectThor() {
		executeCommand("remmina -c /home/athena/.remmina/thor.remmina")
		heimdallr = false
		loki = false
		snotra = false
		athena = false
		apple = false
		thor = true
		return getStatus()
	}

	Map<String, Boolean> disconnect() {
		executeCommand("remmina -q")
		heimdallr = false
		loki = false
		snotra = false
		athena = false
		apple = false
		thor = false
		return getStatus()
	}

	Map<String, Boolean> getStatus() {
		def map = [:]
		map.put("loki", loki)
		map.put("heimdallr", heimdallr)
		map.put("snotra", snotra)
		map.put("apple", apple)
		map.put("thor", thor)
		//map.put("athena", athena)
		map
	}

	def executeCommand(String command) {
		try {
			Runtime.getRuntime().exec(command)
		} catch (Exception e) {
			e.printStackTrace()
		}
	}
}
