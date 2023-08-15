# Daily-Work


<strong>NoSQL databases can be classified into four types,</strong>

1. Key-Value (KV) Stores
2. Document Stores
3. Column Family Data stores or Wide column data stores
4. Graph Databases
<hr>
1. <strong>Key-Value (KV) Stores</strong>
This is the simplest type of NoSQL database.Under this type, the data is stored in the form of key/value pairs. For each Key, there is a value assigned to it. Each Key is unique and accepts only strings, whereas the value corresponding to the particular Key can accept String, JSON, XML, etc. Owing to this behavior, it is capable of dealing with massive loads of data. 

KV stores have fast query performance and are best suited for applications that require content caching, e.g. a gaming website that constantly updates the top 10 scores & players.

<img src = "https://www.blazeclan.com/wp-content/uploads/2023/02/nosql-key-value-stores-example.png">


<strong>Key-Value Pairs Database: Features:</strong>

1. Consistency
2. Transactions
3. Query Features
4. Data Structure
5. Scaling


# Pros:
–  Simple Data model

–  Scalable

–  Value can include JSON, XML, flexible schemas

–  Extremely Fast Owing to it’s simplicity

–  Best fit for cases where data is not highly related

# Cons:
–  No relationships, create your own foreign keys

–  Not suitable for complex data

– Lacks Scanning Capabilities

–  Not ideal for operations rather than CRUD (create, read, update Delete )

# Key-Value Pairs Database: Use Case:
These kinds of databases are best suited for the following cases:

Storing session information: offers to save and restore sessions.
User preferences: Specific Data for a particular user
Shopping carts: easily handle the loss of storage nodes and quickly scale Big data during a holiday/sale on an e-commerce application.
Product recommendations: offering recommendations based on the person’s data. 
Popular KV Stores would include Dynamo DB, Redis, BerkleyDB.


<hr>

# 2. Document Stores
Document Stores are an extension of the simplicity of Key Value stores, where the values are stored in structured documents like XML or JSON. Document stores make it easy to map Objects in the object- oriented software.

A document database is schema free, you don’t have to define a schema beforehand and adhere to it. It allows us to store complex data in document formats (JSON, XML etc.).

Document databases do not support relations. Each document in the document store is independent and there is no relational integrity.

Document stores can be used for all use cases of a KV store database, but it also has additional advantages like there is no limitation of querying just by the key but even querying attributes within a document, also data in each document can be in a different format. E.g. A product review website where zero or many users can review each product and each review can be commented on by other users and can be liked or disliked by zero to many users.

E.g, A product review website where zero or many users can review each product, and each review can be commented on by other users and can be liked or disliked by zero to many users.


<img src="https://www.blazeclan.com/wp-content/uploads/2023/02/nosql-document-stores-document-example.png">


# Document Stores: Features:
Features of document databases

1. Faster Querying
2. A large amount of data can be easily handled owing to its structure
3. Flexible Indexing
# Pros:
–  Simple & Powerful Data model

–  Scalable

–  Open Formats

–  No foreign Keys

# Cons:
–          Not suitable for relational data

–          Querying limited to keys & indexes

–          Map Reduce for more significant queries

Document Stores: Use Case:
User Profiles: Since they have a flexible Schema, the document can store different attributes and values. This enables the users to store different types of information.
Management of Content: Since it has a flexible schema, collection and storing any data has been made possible. This allows the creation of new types of content, including images, videos, comments, etc. Everyday use is seen in blogging platforms.
Some popular Document stores are MongoDB, CouchDB, Lotus Notes.


<hr>

# 3. Column Family Data stores or Wide column data stores
Wide column data stores take a hybrid approach mixing the declarative characteristics game of relational databases with the key-value pair based and totally variables schema of key-value stores. Wide Column databases stores data tables as sections of columns of data rather than as rows of data.

Columnar Family databases have their origins in Google’s Bigtable. According to Google’s paper on Bigtable, “A Bigtable is a sparse, distributed, persistent multidimensional sorted map.” This definition might leave you confused, just as I was, it was all greek to my RDBMS oriented mind.

Here is a more simplified explanation, a column family data store is a multi-dimensional key value store (map or associative array) which is persistent (values persist after creation or access), distributed (data is distributed across multiple computing  & storage nodes), sorted (sorted keys) and sparse (values for certain dimensions may not be populated, similar to sparsely populated rows in RDBMS).

The multi-dimensional aspect of column stores brings in another concept of column families.

Column-family databases store data in column families as rows that have many columns associated with a row key. Column families are groups of related data that is often accessed together.

# There are two types of column families:

1. Standard Column family: Standard Column family consists of a key-value pair, where the key is mapped to a value that is a set of columns. In analogy with relational databases, a standard column family is as a “table”, each key-value pair being a “row”.
2. Super Column family: Super Column family consists of a key-value pair, where the key is mapped to a value that are column families. In analogy with relational databases, a super column family is something like a “view” on a number of tables. It can also be seen as a map of tables.

<img src="https://www.blazeclan.com/wp-content/uploads/2023/02/nosql-column-family-data-stores.png">


# Column Oriented Database: Features:
Features of Wide column stores:

Multidimensional key store
Persistent in nature 
Distributed
High flexibility
# Pros:
–          Supports semi-structured data

–          Naturally indexed

–          Scalable

# Cons:
–          Not suitable for relational data

# Column Based Databases: Use Case: 
1. User Preferences
2. Business Intelligence
3. Managing data warehouses
4. Reporting Systems

# Some of the popular Wide column data stores include Google’s Bigtable, Cassandra, HBase.


<hr>

# 4. Graph Databases


Graph Databases specific purpose is the storage of graph-oriented data structures. A graph database is any storage system that provides index-free adjacency. This means that every node contains a direct pointer to its adjacent element and no index lookups are necessary. As the number of nodes increases, the cost of a hop remains the same.

Graph databases are optimized for traversing through connected data, e.g. traversing through a list of contacts on your social network to find out the degree of connections.

Graph databases usually come with a flexible data model, which means there is no need to define the types of edges and vertices.

<img src="https://www.blazeclan.com/wp-content/uploads/2023/02/nosql-graph-databases.png">


# Graph Databases: Features:
Features of graph databases

- Flexibility
- Agility
- Improved performance, even with huge volumes of data.
- Typical use cases for graph databases would include social networking site, recommendation engine.

# Pros:
–  Extremely powerful

–  Connected data is locally indexed

–  Can provide ACID

–  Results in real-time

–  Agile Structure

# Cons:

–  Difficult to scale out, though can scale up

# Graph Databases: Use Case:
Typical use cases for graph databases would include 

Social networking site
Recommendation engine
Logistics
Risk assessment
Fraud detection 
Some of the popular graph databases are Neo4j, OrientDB, Allegrograph.

<hr>


# ER-MODEL and Relational Model

1. E-R Model : E-R model stands for Entity-Relationship model. ER Model is used to model the logical view of the system from data perspective which consists of these components: Entity, Entity Type, Entity Set. An Entity may be an object with a physical existence – a particular person, car, house, or employee – or it may be an object with a conceptual existence – a company, a job, or a university course.

2. Relational model : Relational Model was proposed by E.F. Codd to model data in the form of relations or tables.

<table border="10">
<tr>
<th>ER model</th>
<th>Relational model</th>
</tr>

<tr>
<td>ER model is the high level or conceptual model.</td>
<td>It is the representational or implementation model.</td>
</tr>

<tr>
<td>It is used by people who don’t know how database is implemented.</td>
<td>It is used by programmers.</td>
</tr>

<tr>
<td>It represents collection of entities and describes relationship between them.</td>
<td>It represent data in the form of tables and describes relationship between them.</td>
</tr>

<tr>
<td>It is easy to understand the relationship between entities.</td>
<td>It is less easy to derive the relationship between different tables</td>
</tr>

<tr>
<td>E-R model is more flexible than the relational model.</td>
<td>Relational model is less flexible than E-R model.</td>
</tr>

<tr>
<td>E-R model does not involve normalization.</td>
<td>Relational model use case  is useful for implementation and maintenance</td>
</tr>

<tr>
<td>
Some of the popular Language and Notations used-

- Chen
- UML
- Crow’s foot
- Bachman and others.
</td>
<td>
Some of the popular Language and Notations used-

- SQL
- MySQL
</td>
</tr>
</table>
