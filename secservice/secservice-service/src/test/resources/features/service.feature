Feature: Tests the secservice Service using a REST client. 
 
  Scenario: Test Authorized
    When I construct a REST request with authorization header in realm "quickstart" for user "jdoe" and password "jdoe"
    And I construct a REST request with header "x-chenile-tenant-id" and value "quickstart"
    And I POST a REST request to URL "/sec/op1" with payload
    """
    {
	}
	"""
	Then the REST response key "id" is "SecServiceImpl"

  Scenario: Test UnAuthorized
    When I construct a REST request with authorization header in realm "quickstart" for user "alice" and password "alice"
    And I construct a REST request with header "x-chenile-tenant-id" and value "quickstart"
    And I POST a REST request to URL "/sec/op1" with payload
    """
    {
	}
	"""
    Then the http status code is 403

  Scenario: Test Authorized for Tenant1
    When I construct a REST request with authorization header in realm "tenant1" for user "james" and password "james"
    And I construct a REST request with header "x-chenile-tenant-id" and value "tenant1"
    And I POST a REST request to URL "/sec/op1" with payload
    """
    {
	}
	"""
    Then the REST response key "id" is "SecServiceImpl"

  Scenario: Test UnAuthorized for Tenant1
    When I construct a REST request with authorization header in realm "tenant1" for user "sam" and password "sam"
    And I construct a REST request with header "x-chenile-tenant-id" and value "tenant1"
    And I POST a REST request to URL "/sec/op1" with payload
    """
    {
	}
	"""
    Then the http status code is 403

  Scenario: Test No auth header
    When I construct a REST request with header "x-chenile-tenant-id" and value "tenant1"
    And I POST a REST request to URL "/sec/op1" with payload
    """
    {
	}
	"""
    Then the http status code is 403
    