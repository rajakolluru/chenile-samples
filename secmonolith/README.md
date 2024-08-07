# Secmonolith Project
## Chenile generated Mini Monolith Project
This project is generated using _app-gen_ that ships with the Chenile project. The project is ready for use. Please do the following:

```bash
# Build the project
make build
# Get help on various options with make
make
# Run the project
make run
# Test the running program
make test-script

```

# Swagger URLs
The project is bundled with spring-doc-open api for automatically generating the swagger json. The project is also configured with 
chenile-config-maven-plugin to automatically generate the configurations in JSON format. These configurations can be used to generate 
entries in Service registry

http://localhost:8080/swagger-ui.html -> contains swagger documentation for the generated services

http://localhost:8080/v3/api-docs -> emits the swagger json.

Please see secmonolith-package/target/openapi.json to see the generated Swagger JSON
Please see secmonolith-package/target/service-registry to see the Chenile generated JSONs for possible import to a service registry

Make sure that keycloak server is running and that quickstart realm is enabled. 
