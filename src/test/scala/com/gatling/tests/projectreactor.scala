package com.gatling.tests

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class projectreactor extends Simulation {

	val httpProtocol = http
		.baseUrl("https://www.rokomari.com/")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())

	val headers_0 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9,bn;q=0.8",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="99", "Google Chrome";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "document",
		"sec-fetch-mode" -> "navigate",
		"sec-fetch-site" -> "same-origin",
		"sec-fetch-user" -> "?1",
		"upgrade-insecure-requests" -> "1",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.51 Safari/537.36")

	val headers_3 = Map(
		"Origin" -> "https://www.rokomari.com",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.51 Safari/537.36",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="99", "Google Chrome";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_4 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9,bn;q=0.8",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="99", "Google Chrome";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "script",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.51 Safari/537.36")

	val headers_7 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9,bn;q=0.8",
		"content-type" -> "text/plain",
		"origin" -> "https://www.rokomari.com",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="99", "Google Chrome";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "cross-site",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.51 Safari/537.36")

	val headers_8 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9,bn;q=0.8",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="99", "Google Chrome";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.51 Safari/537.36")

	val headers_12 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9,bn;q=0.8",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="99", "Google Chrome";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "iframe",
		"sec-fetch-mode" -> "navigate",
		"sec-fetch-site" -> "cross-site",
		"upgrade-insecure-requests" -> "1",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.51 Safari/537.36",
		"x-client-data" -> "CJG2yQEIprbJAQjBtskBCKmdygEInvnLAQjnhMwBCKGGzAEIm5zMAQjbncwB")

	val headers_13 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9,bn;q=0.8",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="99", "Google Chrome";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "script",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.51 Safari/537.36",
		"x-client-data" -> "CJG2yQEIprbJAQjBtskBCKmdygEInvnLAQjnhMwBCKGGzAEIm5zMAQjbncwB")

	val headers_14 = Map(
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.51 Safari/537.36",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="99", "Google Chrome";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_23 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9,bn;q=0.8",
		"origin" -> "https://www.rokomari.com",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="99", "Google Chrome";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "document",
		"sec-fetch-mode" -> "navigate",
		"sec-fetch-site" -> "same-origin",
		"sec-fetch-user" -> "?1",
		"upgrade-insecure-requests" -> "1",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/99.0.4844.51 Safari/537.36")
	val uri01 = "https://connect.facebook.net/signals/config/2663779950320576"
	val uri02 = "https://www.google-analytics.com"
	val uri03 = "https://vars.hotjar.com/box-acca23410e696f2ca3087d947271c3d0.html"
	val uri04 = "https://www.rokomari.com"
	val uri05 = "https://googleads.g.doubleclick.net/pagead/viewthroughconversion/804358854"
	val uri06 = "https://www.googletagmanager.com"
	val uri07 = "https://bid.g.doubleclick.net/xbbe/pixel"
	val uri08 = "https://www.google.com/recaptcha/api2"
	val uri09 = "https://static.hotjar.com/c/hotjar-452038.js"
	val uri11 = "https://static.revechat.com"


	val scn = scenario("rokomariproject")
		.exec(http("request_0")
			.get(uri04 + "/login")
			.headers(headers_0)
			.resources(http("request_1")
			.get(uri06 + "/gtag/js?id=AW-804358854"),
				http("request_2")
			.get(uri06 + "/gtm.js?id=GTM-TGQ3P6"),
				http("request_3")
			.get(uri04 + "/static/200/vendors/ionic/fonts/ionicons.ttf?v=2.0.1")
			.headers(headers_3),
				http("request_4")
			.get(uri11 + "/widget/scripts/new-livechat.js?1646851063418")
			.headers(headers_4),
				http("request_5")
			.get(uri09 + "?sv=5")
			.headers(headers_4),
				http("request_6")
			.get(uri01 + "?v=2.9.55&r=stable"),
				http("request_7")
			.post(uri02 + "/j/collect?v=1&_v=j96&a=1556095564&t=pageview&_s=1&dl=https%3A%2F%2Fwww.rokomari.com%2Flogin&ul=en-us&de=UTF-8&dt=Login%20To%20Rokomari%20%7C%20Rokomari.com&sd=24-bit&sr=1366x768&vp=1349x316&je=0&_u=AACAAEABAAAAAC~&jid=&gjid=&cid=1090807252.1646847138&tid=UA-28456258-1&_gid=2079281962.1646847138&_slc=1&z=943662011")
			.headers(headers_7),
				http("request_8")
			.get(uri02 + "/collect?v=1&_v=j96&a=1556095564&t=pageview&_s=1&dl=https%3A%2F%2Fwww.rokomari.com%2Flogin&ul=en-us&de=UTF-8&dt=Login%20To%20Rokomari%20%7C%20Rokomari.com&sd=24-bit&sr=1366x768&vp=1349x316&je=0&_u=SACAAEABAAAAAC~&jid=&gjid=&cid=1090807252.1646847138&tid=UA-28456258-1&_gid=2079281962.1646847138&gtm=2wg370TGQ3P6&z=230228884")
			.headers(headers_8),
				http("request_9")
			.get(uri03),
				http("request_10")
			.get(uri11 + "/widget/d/html/client_version_2.html?version=30211229"),
				http("request_11")
			.get(uri02 + "/collect?v=1&_v=j96&a=1556095564&t=event&ni=0&_s=1&dl=https%3A%2F%2Fwww.rokomari.com%2Flogin&ul=en-us&de=UTF-8&dt=Login%20To%20Rokomari%20%7C%20Rokomari.com&sd=24-bit&sr=1366x768&vp=1349x316&je=0&ec=Ecommerce&ea=Checkout&_u=SACAAEABAAAAAC~&jid=&gjid=&cid=1090807252.1646847138&tid=UA-28456258-1&_gid=2079281962.1646847138&gtm=2wg370TGQ3P6&z=845604323")
			.headers(headers_8),
				http("request_12")
			.get(uri08 + "/anchor?ar=1&k=6LeTlWAUAAAAAMM8JwH4PN8lCJChNA2anKzQtrFB&co=aHR0cHM6Ly93d3cucm9rb21hcmkuY29tOjQ0Mw..&hl=en&v=85AXn53af-oJBEtL2o2WpAjZ&size=normal&cb=fdj0mhrb5oiw")
			.headers(headers_12),
				http("request_13")
			.get(uri05 + "/?random=1646851064432&cv=9&fst=1646851064432&num=1&bg=ffffff&guid=ON&resp=GooglemKTybQhCsO&u_h=768&u_w=1366&u_ah=728&u_aw=1366&u_cd=24&u_his=3&u_tz=360&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa370&sendb=1&ig=1&data=event%3Dgtag.config&frm=0&url=https%3A%2F%2Fwww.rokomari.com%2Flogin&ref=https%3A%2F%2Fwww.rokomari.com%2Fbook&tiba=Login%20To%20Rokomari%20%7C%20Rokomari.com&hn=www.googleadservices.com&async=1&rfmt=3&fmt=4")
			.headers(headers_13),
				http("request_14")
			.get(uri11 + "/client/images/co-browse.png?9")
			.headers(headers_14),
				http("request_15")
			.get(uri08 + "/webworker.js?hl=en&v=85AXn53af-oJBEtL2o2WpAjZ"),
				http("request_16")
			.get(uri11 + "/widget/fonts/revechat.ttf?1hp4ma")
			.headers(headers_3),
				http("request_17")
			.get(uri11 + "/client/sound/notify.mp3"),
				http("request_18")
			.get(uri11 + "/widget/scripts/analytics/ga.js?1646851065544")
			.headers(headers_4),
				http("request_19")
			.get("/tr/?id=2663779950320576&ev=PageView&dl=https%3A%2F%2Fwww.rokomari.com%2Flogin&rl=https%3A%2F%2Fwww.rokomari.com%2Fbook&if=false&ts=1646851065457&sw=1366&sh=768&v=2.9.55&r=stable&ec=0&o=30&fbp=fb.1.1646847140247.331284087&it=1646851063956&coo=false&exp=p0&rqm=GET")
			.headers(headers_8),
				http("request_20")
			.get(uri08 + "/bframe?hl=en&v=85AXn53af-oJBEtL2o2WpAjZ&k=6LeTlWAUAAAAAMM8JwH4PN8lCJChNA2anKzQtrFB")
			.headers(headers_12),
				http("request_21")
			.get("/tr/?id=2663779950320576&ev=Microdata&dl=https%3A%2F%2Fwww.rokomari.com%2Flogin&rl=https%3A%2F%2Fwww.rokomari.com%2Fbook&if=false&ts=1646851065965&cd[DataLayer]=%5B%5D&cd[Meta]=%7B%22title%22%3A%22%5Cn%20%20%20%20%20%20%20%5Cn%20%20%20%20%20%20%20%20%20%20%20%20%5Cn%20%20%20%20%20%20%20%20%20%20%20%20%5Cn%20%20%20%20%20%20%20%20%20%20%20%20%5Cn%20%20%20%20%20%20%20%20%20%20%20%20%5Cn%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20Login%20To%20Rokomari%20%7C%20Rokomari.com%5Cn%20%20%20%20%20%20%20%20%20%20%20%20%5Cn%20%20%20%20%20%20%20%20%5Cn%20%20%20%20%22%2C%22meta%3Adescription%22%3A%22%22%7D&cd[OpenGraph]=%7B%22og%3Aimage%22%3A%22%22%2C%22og%3Aimage%3Awidth%22%3A%22%22%2C%22og%3Aimage%3Aheight%22%3A%22%22%2C%22og%3Atitle%22%3A%22%22%2C%22og%3Adescription%22%3A%22%22%7D&cd[Schema.org]=%5B%5D&cd[JSON-LD]=%5B%5D&sw=1366&sh=768&v=2.9.55&r=stable&ec=1&o=30&fbp=fb.1.1646847140247.331284087&it=1646851063956&coo=false&es=automatic&tm=3&exp=p0&rqm=GET")
			.headers(headers_8)))
		.pause(12)
		.exec(http("request_22")
			.get("/tr/?id=2663779950320576&ev=SubscribedButtonClick&dl=https%3A%2F%2Fwww.rokomari.com%2Flogin&rl=https%3A%2F%2Fwww.rokomari.com%2Fbook&if=false&ts=1646851078582&cd[buttonFeatures]=%7B%22classList%22%3A%22btn%20btn-block%22%2C%22destination%22%3A%22https%3A%2F%2Fwww.rokomari.com%2Flogincheck%22%2C%22id%22%3A%22%22%2C%22imageUrl%22%3A%22radial-gradient(circle%2C%20rgba(0%2C%200%2C%200%2C%200)%201%25%2C%20rgb(51%2C%20194%2C%2077)%201%25)%22%2C%22innerText%22%3A%22Sign%20In%22%2C%22numChildButtons%22%3A0%2C%22tag%22%3A%22button%22%2C%22name%22%3A%22%22%2C%22value%22%3A%22%22%7D&cd[buttonText]=Sign%20In&cd[formFeatures]=%5B%7B%22id%22%3A%22j_username%22%2C%22name%22%3A%22j_username%22%2C%22tag%22%3A%22input%22%2C%22placeholder%22%3A%22Email%20or%20phone%22%2C%22inputType%22%3A%22text%22%7D%2C%7B%22id%22%3A%22j_password%22%2C%22name%22%3A%22j_password%22%2C%22tag%22%3A%22input%22%2C%22placeholder%22%3A%22Password%22%2C%22inputType%22%3A%22password%22%7D%2C%7B%22id%22%3A%22rememberme%22%2C%22name%22%3A%22_spring_security_remember_me%22%2C%22tag%22%3A%22input%22%2C%22inputType%22%3A%22checkbox%22%7D%2C%7B%22id%22%3A%22%22%2C%22name%22%3A%22__spring_security_remember_me%22%2C%22tag%22%3A%22input%22%2C%22inputType%22%3A%22hidden%22%7D%5D&cd[pageFeatures]=%7B%22title%22%3A%22%5Cn%20%20%20%20%20%20%20%5Cn%20%20%20%20%20%20%20%20%20%20%20%20%5Cn%20%20%20%20%20%20%20%20%20%20%20%20%5Cn%20%20%20%20%20%20%20%20%20%20%20%20%5Cn%20%20%20%20%20%20%20%20%20%20%20%20%5Cn%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20Login%20To%20Rokomari%20%7C%20Rokomari.com%5Cn%20%20%20%20%20%20%20%20%20%20%20%20%5Cn%20%20%20%20%20%20%20%20%5Cn%20%20%20%20%22%7D&cd[parameters]=%5B%5D&sw=1366&sh=768&udff[ph]=23f45a88ad8e8a77fb56aa9c3026db5ad102d8ebd327a4b45d9adc553c9e8e6e&v=2.9.55&r=stable&ec=2&o=2078&fbp=fb.1.1646847140247.331284087&it=1646851063956&coo=false&es=automatic&tm=3&exp=p0&rqm=GET")
			.headers(headers_8)
			.resources(http("request_23")
			.post(uri04 + "/logincheck")
			.headers(headers_23)
			.formParam("j_username", "01600292055")
			.formParam("j_password", "himel114")
			.formParam("_spring_security_remember_me", "true")
			.formParam("__spring_security_remember_me", "on"),
				http("request_24")
			.get(uri04 + "/static/200/dist/desktop/css/bundle6-desktop.css?v=3"),
				http("request_25")
			.get(uri06 + "/gtag/js?id=AW-804358854"),
				http("request_26")
			.get(uri09 + "?sv=5"),
				http("request_27")
			.get(uri06 + "/gtm.js?id=GTM-TGQ3P6"),
				http("request_28")
			.get(uri11 + "/widget/scripts/new-livechat.js?1646851079285")
			.headers(headers_4),
				http("request_29")
			.get(uri04 + "/static/200/vendors/ionic/fonts/ionicons.ttf?v=2.0.1")
			.headers(headers_3),
				http("request_30")
			.get(uri01 + "?v=2.9.55&r=stable"),
				http("request_31")
			.post(uri02 + "/j/collect?v=1&_v=j96&a=133259327&t=pageview&_s=1&dl=https%3A%2F%2Fwww.rokomari.com%2Floginerror%2F&ul=en-us&de=UTF-8&dt=Login%20To%20Rokomari%20%7C%20Rokomari.com&sd=24-bit&sr=1366x768&vp=1349x316&je=0&_u=AACAAEABAAAAAC~&jid=&gjid=&cid=1090807252.1646847138&tid=UA-28456258-1&_gid=2079281962.1646847138&_slc=1&z=235811303")
			.headers(headers_7),
				http("request_32")
			.get(uri02 + "/collect?v=1&_v=j96&a=133259327&t=pageview&_s=1&dl=https%3A%2F%2Fwww.rokomari.com%2Floginerror%2F&ul=en-us&de=UTF-8&dt=Login%20To%20Rokomari%20%7C%20Rokomari.com&sd=24-bit&sr=1366x768&vp=1349x316&je=0&_u=SACAAEABAAAAAC~&jid=&gjid=&cid=1090807252.1646847138&tid=UA-28456258-1&_gid=2079281962.1646847138&gtm=2wg370TGQ3P6&z=156879969")
			.headers(headers_8),
				http("request_33")
			.get(uri02 + "/collect?v=1&_v=j96&a=133259327&t=event&ni=0&_s=1&dl=https%3A%2F%2Fwww.rokomari.com%2Floginerror%2F&ul=en-us&de=UTF-8&dt=Login%20To%20Rokomari%20%7C%20Rokomari.com&sd=24-bit&sr=1366x768&vp=1349x316&je=0&ec=Ecommerce&ea=Checkout&_u=SACAAEABAAAAAC~&jid=&gjid=&cid=1090807252.1646847138&tid=UA-28456258-1&_gid=2079281962.1646847138&gtm=2wg370TGQ3P6&z=416670871")
			.headers(headers_8),
				http("request_34")
			.get(uri08 + "/anchor?ar=1&k=6LeTlWAUAAAAAMM8JwH4PN8lCJChNA2anKzQtrFB&co=aHR0cHM6Ly93d3cucm9rb21hcmkuY29tOjQ0Mw..&hl=en&v=85AXn53af-oJBEtL2o2WpAjZ&size=normal&cb=5l8u4j6xg6c2")
			.headers(headers_12),
				http("request_35")
			.get(uri03),
				http("request_36")
			.get("/tr/?id=2663779950320576&ev=PageView&dl=https%3A%2F%2Fwww.rokomari.com%2Floginerror%2F&rl=&if=false&ts=1646851080423&sw=1366&sh=768&v=2.9.55&r=stable&ec=0&o=30&fbp=fb.1.1646847140247.331284087&it=1646851079599&coo=false&rqm=GET")
			.headers(headers_8),
				http("request_37")
			.get(uri11 + "/widget/d/html/client_version_2.html?version=30211229"),
				http("request_38")
			.get(uri05 + "/?random=1646851080658&cv=9&fst=1646851080658&num=1&bg=ffffff&guid=ON&resp=GooglemKTybQhCsO&eid=376635471&u_h=768&u_w=1366&u_ah=728&u_aw=1366&u_cd=24&u_his=4&u_tz=360&u_java=false&u_nplug=5&u_nmime=2&gtm=2oa370&sendb=1&ig=1&data=event%3Dgtag.config&frm=0&url=https%3A%2F%2Fwww.rokomari.com%2Floginerror%2F&tiba=Login%20To%20Rokomari%20%7C%20Rokomari.com&hn=www.googleadservices.com&async=1&rfmt=3&fmt=4")
			.headers(headers_13),
				http("request_39")
			.get(uri11 + "/client/images/co-browse.png?9")
			.headers(headers_14),
				http("request_40")
			.get(uri08 + "/webworker.js?hl=en&v=85AXn53af-oJBEtL2o2WpAjZ"),
				http("request_41")
			.get(uri11 + "/widget/fonts/revechat.ttf?1hp4ma")
			.headers(headers_3),
				http("request_42")
			.get(uri11 + "/client/sound/notify.mp3"),
				http("request_43")
			.get(uri11 + "/widget/scripts/analytics/ga.js?1646851081372")
			.headers(headers_4),
				http("request_44")
			.get("/tr/?id=2663779950320576&ev=Microdata&dl=https%3A%2F%2Fwww.rokomari.com%2Floginerror%2F&rl=&if=false&ts=1646851081365&cd[DataLayer]=%5B%5D&cd[Meta]=%7B%22title%22%3A%22%5Cn%20%20%20%20%20%20%20%5Cn%20%20%20%20%20%20%20%20%20%20%20%20%5Cn%20%20%20%20%20%20%20%20%20%20%20%20%5Cn%20%20%20%20%20%20%20%20%20%20%20%20%5Cn%20%20%20%20%20%20%20%20%20%20%20%20%5Cn%20%20%20%20%20%20%20%20%20%20%20%20%20%20%20Login%20To%20Rokomari%20%7C%20Rokomari.com%5Cn%20%20%20%20%20%20%20%20%20%20%20%20%5Cn%20%20%20%20%20%20%20%20%5Cn%20%20%20%20%22%2C%22meta%3Adescription%22%3A%22%22%7D&cd[OpenGraph]=%7B%22og%3Aimage%22%3A%22%22%2C%22og%3Aimage%3Awidth%22%3A%22%22%2C%22og%3Aimage%3Aheight%22%3A%22%22%2C%22og%3Atitle%22%3A%22%22%2C%22og%3Adescription%22%3A%22%22%7D&cd[Schema.org]=%5B%5D&cd[JSON-LD]=%5B%5D&sw=1366&sh=768&v=2.9.55&r=stable&ec=1&o=30&fbp=fb.1.1646847140247.331284087&it=1646851079599&coo=false&es=automatic&tm=3&rqm=GET")
			.headers(headers_8),
				http("request_45")
			.get(uri08 + "/bframe?hl=en&v=85AXn53af-oJBEtL2o2WpAjZ&k=6LeTlWAUAAAAAMM8JwH4PN8lCJChNA2anKzQtrFB")
			.headers(headers_12),
				http("request_46")
			.get(uri07 + "?d=KAE")
			.headers(headers_12)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}