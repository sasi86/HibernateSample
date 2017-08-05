# HibernateSample

# JPA

## Managing entities
- Persistence unit
- Mapping entities
  - Annotations
  - XML
- Unit testing
![alt text](https://github.com/sasi86/HibernateSample/blob/master/jpa/jpa_images/1.Managing%20Entities.png)


## Entity Manager
- Responsible to synchronize entity object with database.
- Entity Manager obtains the entity and manages the state of the entities, without which entities are considered detached.

![alt text](https://github.com/sasi86/HibernateSample/blob/master/jpa/jpa_images/2.Entity%20Manager.png)

## Persistance Context
- Managed set entities is called persistance context

![alt text](https://github.com/sasi86/HibernateSample/blob/master/jpa/jpa_images/3.Persistance_xml.png)

## Persistance-xml Properties

![alt text](https://github.com/sasi86/HibernateSample/blob/master/jpa/jpa_images/4.props_persistance.png)

## Persistance Unit - Entity Manager Factory - emf
- Named configuration of set of entities

## Entity

![alt text](https://github.com/sasi86/HibernateSample/blob/master/jpa/jpa_images/5.Entity%20Mapping.png)

![alt text](https://github.com/sasi86/HibernateSample/blob/master/jpa/jpa_images/6.%20Configuration%20by%20convention.png)

### Commonly Used Annotations for customizing

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

![alt text](https://github.com/sasi86/HibernateSample/blob/master/jpa/jpa_images/7.Customizing%20Entity.png)


### XML Mapping
- Alternatiely XML can be used over annotations. When used both Xml takes precedance over annotation.
![alt text](https://github.com/sasi86/HibernateSample/blob/master/jpa/jpa_images/8.XML%20Mapping.png)
- Referencing xml mapping in persistance.xml
![alt text](https://github.com/sasi86/HibernateSample/blob/master/jpa/jpa_images/9.Refer%20Persistance.png)


