# Design Patterns / Creational: Factory Method

<p>When we create a complex object, that is, with many business rules and methods, it is always a risk to have constructors with numerous parameters.

Methods that expect more than 4, 5 parameters can impair code readability and end up becoming what we call a Long Parameter List.

Another problem is that, since some situations don't need so many parameters, you might get a bunch of parameters coming in as null or empty.

The Builder pattern separates the construction of a complex object from its representation, making it less "plastered", the process of building different representations of the same object.</p>

<hr>

<p><b>Scenario:</b>To build a house, you need windows, doors, walls and a roof. Now there is a demand from the business sector to create an apartment as well. Solve this problem with the builder pattern.</p>
<hr>

### How to run this app?

<p>Obs: You must have JAVA installed on your computer</p>

<ol>
    <li>Download the 'builder_pattern.jar' file inside de 'out' folder</li>
    <li>Open your terminal</li>
    <li>Go to your Download folder</li>
    <li>Type: java -jar builder_pattern.jar</li>
</ol>