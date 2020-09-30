# Observatory exercise. IoC and DI.

### understanding Inversion o Control and Dependency Injection

The problem: create a functional app that uses the IoC and DI methodologies.

### Proposal

##### Context

There is an astronomical **Observatory**, that will be the client of our solution. This observatory asks for an **application** that will be used for research.

The app is intended to be used for processing the images of different **astronomical objects** in the sky. The investigation process will be performed entarely with this app, so we must provide it with the functionalities for all the possible objects. These objects include **stars**, **planets** and **galaxies**. 

Furthermore, if new kind of astronomical objects are found, this app should be capable of doing the same research on those hypotetical objects (for example, **exoplanets**).

##### Solution

Two ways are implemented for this solution:

+ On the first solution, instance creations of the required classes are harcoded. This solution is provided inside the package under the name `astronomicalObservation.no.service`
+ The second proposal implements IoC and DI as requested by the exercise. Here, we use the `ObservationContainerInjector` class to control the dependencies injection by the `ObservationServiceInjector` class.

