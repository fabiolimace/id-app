ID App
===============================

This is a hello world app.

It depends on [ID API](https://github.com/fabiolimace/id-api) running on 8080.

Usage
-------------------------------

Clone the ID API:

```bash
git clone https://github.com/fabiolimace/id-api.git
```

Start the ID API:

```
cd id-api
./docker.sh
```

Start the ID App:

```
cd id-app
./mvnw clean package
java -jar target/id-app-0.0.1-SNAPSHOT.jar
```

Open the URL `http://localhost:8081/` in a browser. You will see this:

> # ID App
> Your UUID is `44f4549a-d163-49d5-85f8-c3e2ed8a9f26`.

License
------------------------

This program is Open Source software released under the [MIT license](https://opensource.org/licenses/MIT).
