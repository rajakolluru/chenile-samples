Feature: Tests the secservice Service using a REST client. 
 
  Scenario: Trial test. Change it according to the actual service

    When I POST a REST request to URL "/secservice/op1" with payload
    """
    {
	 
	}
	"""
	Then the REST response key "id" is "SecserviceServiceImpl"
	 
    