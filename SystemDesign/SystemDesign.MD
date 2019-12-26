Table of Content
================

* [Table of Contents](#table-of-contens)
* [Interview](#interview)
* [Basics](#basics)
    * [Load Balance](#load-balance)
    * [Message Queue](#message-queue)
    * [Storage](#storage)
        * [sharding(data partition)](#sharding)
        * [no-sql](#nosql)
        * [no-sql vs sql](#nosql-vs-sql)

* [Design Instagram](#Instagram)
    * [Requirement](#Instagram-Requirement)
        * [Constraint](#Instagram-Constraints)

* [Chat System](#Chat-System)
    * [Constraint](#Chat-System-Constraints)
# sharding
- methods
    spliting the database to subsets and each of them only manage a subsets of data, 
    
- pros:
    - less trafic (w/r) to a database,
    - less replicatation 
    - more cache hits
    - 
# Instragram
## Instagram Requirement
Design photo-sharing service like Instagram, where users can upload photos to share them with other users

- functional requirement: 
    - upload/download/view photos
    - perform searches based on photo/video titles 
    - follow other users 
    - generate and display users' timeline consisting of top photos from all the people the user follows 

- non-function requirement:
    - highly available 
    - latency under 200 ms for timeline generation 
    - Consistency can take a hit if user doesn't use the photo for a while
    - highly reliable, photo/video upload should not be lost 
    - 

- Important: 
    - it is all above Meta data 
    - too much index in relational database will cause latency in writing (write to a B+ tree)
    - 
### Instagram Consideration
- read heavy, need to retrieve photo heavily 
- storage efficiency 
- low latency 
- 100% available for data, users will never lose his/her data once uploaded. 


### Instagram Capacity Estimation and Constraints 
- Assume 300M total users, with 1M daily active users 
- 2M new photos every day, 23 new photos every second 
- average photo file size >= 200KB 
- total space required for 1 day of photos
    - 2M * 200KB => 400 GB 
- total space required for 5 years: 
    - 400GB * 365 * 5 = 712 TB 

### Instagram Design 
- Two cases:
    - upload photos
    - view/search photos 
- storage
    - block storage for photos (** File needs to be stored seperately, e.g. Amazon S3, HDFS **)
    - databse servers for meta data of photos 

- schema can be used in no-sql and sql 


# Chat System
### Chat System Constraints
Assume we'll focus on the following workflows:
- Text conversations only
    - Users
        - Add a user
            - Remove a user
            - Update a user
            - Add to a user's friends list
                - Add friend request
                    - Approve friend request
                    - Reject friend request
            - Remove from a user's friends list
        - Create a group chat
            - Invite friends to a group chat
            - Post a message to a group chat
        - Private 1-1 chat
            - Invite a friend to a private chat
            - Post a meesage to a private chat
    - No need to worry about scaling initially

