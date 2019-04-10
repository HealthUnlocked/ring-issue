# ring-issue

## issue 

When an unhandled exception is thrown, the ring handler is called *twice*.

## replication steps

1. `lein run` to run.
2. `curl localhost:1111`

you will see the logging `*** IN HANDLER` appear *twice* in the logs - once before the `random exception` is logged, and once after.
