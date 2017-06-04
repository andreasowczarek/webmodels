package org.mdedetrich.webmodels

/**
  * Problem Details for HTTP APIs
  * @see https://tools.ietf.org/html/rfc7807
  * @param `type` A URI reference [RFC3986] that identifies the
      problem type.  This specification encourages that, when
      dereferenced, it provide human-readable documentation for the
      problem type (e.g., using HTML [W3C.REC-html5-20141028]).  When
      this member is not present, its value is assumed to be
      "about:blank".
  * @param title  A short, human-readable summary of the problem
      type.  It SHOULD NOT change from occurrence to occurrence of the
      problem, except for purposes of localization (e.g., using
      proactive content negotiation; se
  * @param status The HTTP status code ([RFC7231], Section 6)
      generated by the origin server for this occurrence of the problem.
  * @param detail A human-readable explanation specific to this
      occurrence of the problem.
  * @param instance A URI reference that identifies the specific
      occurrence of the problem.  It may or may not yield further
      information if dereferenced.
  */
case class Problem(`type`: Option[String],
                   title: String,
                   status: Option[Int],
                   detail: Option[String],
                   instance: Option[String])