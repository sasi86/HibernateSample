# HibernateSample

# JPA

## Managing entities
- Persistence unit
- Mapping entities
  - Annotations
  - XML
- Unit testing

## Entity Manager
- Responsible to synchronize entity object with database.
- Entity Manager obtains the entity and manages the state of the entities, without which entities are considered detached.

## Persistance Context
Managed set entities is called persistance context

## Persistance Unit - Entity Manager Factory -emf
Named configuration of set of entities

## Entity

### Commonly Used Annotations

- @Entity - Signifies the pojo as table in db (Pojo name = Table name)
- @Table - Used when table is different from the pojo name
- @Id - Signifies the column as primary key
  - @GeneratedValue(Strategy = GenerationType.SEQUENCE) //DB SQL sequence 
  - @GeneratedValue(Strategy = GenerationType.IDENTITY) // DB Identity
  - @GeneratedValue(Strategy = GenerationType.TABLE) // Stores a Sequence in a table and increments it
  - @GeneratedValue(Strategy = GenerationType.AUTO) // underlying DB takes care of it
- @Temporal(TemporalType.DATE/TIME/TIMESTAMP) - Used on a date field.
- @Transient - Used when the column used is  not mapped with DB table.
- @Enumerated(EnumType.ORDINAL/STRING) - Stored as a integer in db

