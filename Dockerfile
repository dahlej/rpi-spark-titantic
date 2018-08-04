FROM dahlej/spark:2.3.1

RUN mkdir -p /opt/spark/jars
COPY target/scala-2.11/titantic_2.11-0.1.jar /opt/spark/jars
