# SPRING BOOT GRAPHQL EXAMPLE

## Synopsis

The project is a Spring Boot Application with GraphQL.

## Motivation

I wanted to do a Spring Boot Application that uses GraphQL.
It has one Mutation to create a Thing.
It has one Query to get a Thing.
A Thing object is anything that has an id, name, and description.

## Schema

<pre><code>

input ThingInput {
    id: Int!
    name: String!
    description: String!
}

type Thing {
    id: Int!
    name: String!
    description: String!
}

type Query {
    thing(name:String) : Thing;
}

type Mutation {
    createThing(input: ThingInput) : Thing;
}

</code></pre>


## QUERIES

<pre><code>

USING POSTMAN:
--------------
POST
http://localhost:8080/graphql

QUERY:
------
mutation createThing($req: ThingInput) {
        createThing(input: $req) {
          id
          name
          description
      }
}

GRAPHQL VARIABLES:
------------------
{
	"req": {
	    "id": 100
		"name": "TV",
		"description": "LG Nano"
	}
}

Response:
---------
{
    "data": {
        "createThing": {
            "id": 100
            "name": "TV",
            "description": "LG Nano"
        }
    }
}

---------------------------------------------------------

USING POSTMAN:
--------------
POST
http://localhost:8080/graphql

QUERY:
------
query {
    thing(name:"TV")  {
        id
        name
        description
    }
}


Response:
---------
{
    "data": {
        "thing": {
            "id": "100",
            "name": "TV",
            "description": "LG Nano"
        }
    }
}



</code></pre>

## License

All work is under Apache 2.0 license