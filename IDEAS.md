# Ideas

## Format Requirements

* Within audio range of device
* Easily distinguishable from ambient noise
* Reasonably short
* Crossovers are easy to resolve:
  * Easy to differentiate between messages
  * OR recognize conflicting signals and send a request for backup (non-optimal)
* Contains significant information
  * Original Sender
  * A sentence of text
  * Intended recipient
  * ???

## Proposed Algorithms

### Base-6 FSK

* Message made of 3 composite frequencies, each one a bit in a base-7 system
* Base 7 broken down to Base 2
* Bitshifting/some bit packing used to reassemble to string
* Program parses string
