# OOP Basics

Keywords:
Classes,
Objects

---

Classes

- contain code, specifically code we want to execute in an OOPL
- contain methods, the code you actually execute, we deem these as the _behavior_ of the class
- Different kinds depending on their fcnality: model classes, DAO classes, etc

Anatomy of a method

```java
    public return_Type someMethod(parameter_type name_of_parameter)
    {
        //some logic aka method body
        return some_instance_of_return_type;
    }
```

**?** Why use parameters???

**A** To be able to pass values the method would need to accomplish it's purpose. To pass values to be processed. Input to the method. This is what we have/ what we know.

**?** What is a return type???

**A** after the execution of the method we return an instance of that return_type. This is the output of your method. What we want.

**?** How do we return an instance of the return type?

**A** You use the return keyword followed by a value/instance of the same type as your return type.

Case study: SQL vs DAO

This statement: Select hero_name from heroes where id = 1;

Java equivalent:
parameters: int Id
return type: String heroName

method sig: public String getHeroNameById(int id)

---

This statement: Select hero_name from heroes;

Java equivalent:
parameters: none
return type: Arraylist\<String> heroNames

method sig: public Arraylist\<String> getHeroNames()

---

This statement: insert into heroes (hero_name, hero_alias) values ('Peter Parker', 'Spiderman')

Java equivalent:
parameters: String heroName, String heroAlias
return type: int numberOfRowsAffected

method sig: public int addHero(String hero_name, String hero_alias)

---

This statement: select \* from heroes where id = 1;

Java equivalent:
parameters: int id
return type: ???

---

Objects

- instances of classes
- take up space in memory and hold values

Review of Classes

- classes are blueprints to objects
- templates to objects
- they define fields/properties objects would have

---

Back to the case study: SQL vs Java

If SQL stores data in tables, and tables define how this data is organized
A single record from a table in SQL is an POJO (instance of some class) in Java
Like tables in SQL, a class in Java defines how data is structured.

---

Classes aren't just meant to store data or organize data like POJOs. They also serve a functional purpose like your DAO classes that encapsulate logic to interact with the database. When you're instantiating a class the resulting object would contain
the information we're storing in it (POJOs) and behavior we want it to have (DAOs).
