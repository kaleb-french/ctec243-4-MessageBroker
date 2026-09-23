# Journal
Write your Journal questions and notes here.

Phase 1-
with a message broker it is gonna want it's messages to be push through in order which is why a queue is better. When using a queue you will always know that the messages and sent and received in order.

Phase 2-
the main ways that the failed messages moving to the back of the queue is fair is that, 1. they are not discarded. 2. they don't sit at the front of the queue unti tried again.
