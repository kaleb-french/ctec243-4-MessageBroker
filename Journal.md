# Journal
Write your Journal questions and notes here.

Phase 1-
with a message broker it is gonna want it's messages to be push through in order which is why a queue is better. When using a queue you will always know that the messages and sent and received in order.

Phase 2-
the main ways that the failed messages moving to the back of the queue is fair is that, 1. they are not discarded. 2. they don't sit at the front of the queue unti tried again.

Phase 3-
The "poison" message being one with no chance of success. It will be inserted in the queue at the back as per norm, and it will be attempted when it reaches the front of the queue. Then it will be returned to the rear of the queue and the retry counter will be increased. This will repeat until it has run out of retries at this point it will be enqueued in the Dead Letter Queue. Any messages that run out of retries will be held in the DLQ until it is cleared.
