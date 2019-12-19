There may be an organizational need to use config via jdbc,
this example connects to a postgreSQL database with a single table
named "properties"

The following columns should be added (all varchars):
"profile", "label", "key", "application", "value"

Insert the following entry into the "properties" table:
profile: 'test'
label: 'test'
application: 'test'
key: 'validation'
value: 'NoValidationImpl'

The name of the bean is specified within "value", we will switch
between 'NoValidationImpl' and 'ValidationImpl' based on the value
of the config.

Start the config-server (currently configured to run on port 9443),
then start the config-client (currently configured to run on port 9442).

Make a GET request to the config-client: localhost:9442/rest/validation,
depending on the DB entry you will either see 'Validation' or 'No validation'.

If you change the "value" (between 'NoValidationImpl' and 'ValidationImpl')
you will need to refresh the config on the client by making a POST request
to the config-client's actuator: localhost:9442/actuator/refresh
