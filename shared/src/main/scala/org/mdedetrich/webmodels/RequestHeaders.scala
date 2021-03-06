package org.mdedetrich.webmodels

trait RequestHeaders {
  val `Accept`: String                 = "Accept"
  val `Accept-Charset`: String         = "Accept-Charset"
  val `Accept-Encoding`: String        = "Accept-Encoding"
  val `Accept-Language`: String        = "Accept-Language"
  val `Accept-Datetime`: String        = "Accept-Datetime"
  val `Authorization`: String          = "Authorization"
  val `Cache-Control`: String          = "Cache-Control"
  val `Connection`: String             = "Connection"
  val `Cookie`: String                 = "Cookie"
  val `Content-Length`: String         = "Content-Length"
  val `Content-MD5`: String            = "Content-MD5"
  val `Content-Type`: String           = "Content-Type"
  val `Date`: String                   = "Date"
  val `DNT`: String                    = "DNT"
  val `Expect`: String                 = "Expect"
  val `Forwarded`: String              = "Forwarded"
  val `Front-End-Https`: String        = "Front-End-Https"
  val `From`: String                   = "From"
  val `Host`: String                   = "Host"
  val `If-Match`: String               = "If-Match"
  val `If-Modified-Since`: String      = "If-Modified-Since"
  val `If-Range`: String               = "If-Range"
  val `If-Unmodified-Since`: String    = "If-Unmodified-Since"
  val `Max-Forwards`: String           = "Max-Forwards"
  val `Origin`: String                 = "Origin"
  val `Pragma`: String                 = "Pragma"
  val `Proxy-Connection`: String       = "Proxy-Connection"
  val `Proxy-Authorization`: String    = "Proxy-Authorization"
  val `Range`: String                  = "Range"
  val `Referer`: String                = "Referer"
  val `TE`: String                     = "TE"
  val `User-Agent`: String             = "User-Agent"
  val `Upgrade`: String                = "Upgrade"
  val `Via`: String                    = "Via"
  val `Warning`: String                = "Warning"
  val `X-Requested-With`: String       = "X-Requested-With"
  val `X-Flow-ID`: String              = "X-Flow-ID"
  val `X-Forwarded-For`: String        = "X-Forwarded-For"
  val `X-Forwarded-Host`: String       = "X-Forwarded-Host"
  val `X-Forwarded-Proto`: String      = "X-Forwarded-Proto"
  val `X-Http-Method-Override`: String = "X-Http-Method-Override"
  val `X-ATT-DeviceId`: String         = "X-ATT-DeviceId"
  val `X-Wap-Profile`: String          = "X-Wap-Profile"
  val `X-UIDH`: String                 = "X-UIDH"
  val `X-Csrf-Token`: String           = "X-Csrf-Token"
  val `X-Request-ID`: String           = "X-Request-ID"
  val `X-Correlation-ID`: String       = "X-Correlation-ID"
  val `X-Tenant-ID`: String            = "X-Tenant-ID"
}

object RequestHeaders extends RequestHeaders
