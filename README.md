# Java Rebrickable API

Java API for Rebrickable API v3.

See https://rebrickable.com/api/v3/docs/ for more information about the official Rebrickable API.

Currently, only two methods are implemented:
* Get details about a specific Element ID
* Get details for a specific Set

## Basic cases

Create an instance:

```java
IRebrickableService service = new RebrickableServiceImpl("myApikey");
		
```

Get details for a set:

```java
Set set = service.getSets().getSet("21316-1");

```

Get details for a part:

```java
 Element element = service.getElements().getElement("300101");
```

