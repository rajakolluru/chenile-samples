# Demonstration of Multi-Tenant-Edge Architecture with Chenile

This demo serves a few purposes:
1. It demonstrates how to use MQ-TT in practice in a Chenile application.
2. It shows how to configure MQ-TT for multi-tenancy.
3. It illustrates how Chenile seamlessly integrates with Spring repositories and how it leverages what they bring. It also shows how the ID generation can be made optional for a new record. It only creates an ID if it is not already supplied. This is important if we need to propagate the same record across multiple edges and the cloud.
4. It shows the Chenile Hub-Spoke model for propagating data across the cloud and edges for MQ-TT apps.
5. It shows how to use the cloud switch to switch between edge and cloud behavior and how we can use the hub and spoke model to automatically propagate data from the cloud to the edge and vice-versa.
6. It illustrates the use of Chenile HTTP proxy in the cloud-edge switch.
7. It shows dockerization and how to make different containers for the cloud and edge and how to start these containers in different edges.


