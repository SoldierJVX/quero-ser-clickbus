# Backend Developer Challenge - Clickbus API

API developed with Grails framework and Rest profile, using H2 database to manage CRUD places.

Testing environment - https://clickbus-back-api.herokuapp.com/

# How to Run
### Prerequisites
- Java 1.8 or above
- Grails Framework

### Run
<pre>grails prod run-app</pre>

# Endpoints

### Search Places
<pre>GET /places/search
Params  | Values
------- | -------------
q       | Query to find in the name field
max     | Set max results
</pre>
### List Places
<pre>GET /place
GET /places</pre>

### Get Place
<pre>GET /place/:id</pre>

### Update Place
<pre>PUT /place/:id</pre>

### Delete Place
<pre>DELETE /place/:id</pre>

# Place Parameters
- name
- slug
- city
- state
- dateCreated
- lastUpdated
