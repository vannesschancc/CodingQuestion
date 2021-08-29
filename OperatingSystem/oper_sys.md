# Critical Section


## Requirement for Good critical section 
- At most one process in a CS
- Can’t prevent entry if no others in CS
- Should eventually be able to enter CS
- No assump6ons about CPU speed or number


## Hardware Lock 
- Test and Set Lock (TSL)

## Sofrware Lock
### Semaphores 
- Syncrhonization Variable 
    - wait() -> block, increment the waiting count  
    - signal() -> unblock, decrement the waiting count 

- Binary 
    - 1 : go
    - 2 : stop
    - example 
    `
    #busy waiting 
    p0 
    sem mutex
    wait(mutex)
    <critical section>
    signal(mutex)

    p1
    sem mutex
    wait(mutex)
    <critical section>
    signal(mutex)

    `