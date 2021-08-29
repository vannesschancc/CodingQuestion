## Database:

### Read and Write 
-  A transaction is considered valid only when the following principles are fullfilled. 

-  ACID principle for DB transaction 
    - Atomicity - Each transaction is all or nothing
    - Consistency - Any transaction will bring the database from one valid state to another
    - Isolation - Executing transactions concurrently has the same results as if the transactions were executed serially

        - (What if two concurrent transaction depends on each other? In this case, this is NOT a  valid transaction
    )
    - Durability - Once a transaction has been committed, it will remain so

### Central vs Distributed DB
- As their names imply, a centralized database has only one database file, kept at a single location on a given network; 

- a distributed database is composed of multiple database files stored in multiple physical locations, all controlled by a central DBMS.

- Distributed databases are more complex, and require additional work to keep the data stored up-to-date and to avoid redundancy. However, they provide parallelization (which balances the load between several servers), preventing bottlenecking when a large number of requests come through.

- Centralized databases make data integrity easier to maintain; 
    - （pros) once data is stored, outdated or inaccurate data (stale data) is no longer available in other places. 
    -  (cons) However, it may be more difficult to retrieve lost or overwritten data in a centralized database, since it lacks easily accessible copies by nature.
### Join Operatin SQL

### Normalization vs Denormalization 
Normalization and Denormalization

- Normalization is the process of organizing the relations and attributes of a relational database in a way that **reduces redundancy** and improves data integrity (accurate, consistent, up-to-date data). Data might be arranged based on dependencies between attributes, for example — we might prevent repeating information by using JOIN operations.

    - Data Redudancy can cause 
        - https://www.youtube.com/watch?v=xoTyrdT9SZI

        - insertion abonormally 
        - delete abnormaly 
        - update annormally 

- Denormalization then, is the process of adding redundant data in order to speed up complex queries. We might include the data from one table in another to eliminate the second table and reduce the number of JOIN operations.


### Scale a Relational Database 
- master-slave replication
    - master -> read / write 
    - slave -> read only
- master-master replication
- Federation 
- Sharding 
- Denormalization 
- SQL Tunning

