This is the kafka producer application 

download the kafka latest version below 

https://kafka.apache.org/quickstart

read the steps in the page carefully 




I m instaled below lcotion scripts 


bin\windows\zookeeper-server-start.bat config\zookeeper.properties


bin\windows\kafka-server-start.bat config\kraft\server.properties




bin\windows\kafka-storage.bat random-uuid
bin\windows\kafka-storage.bat format -t tLoQcWLZRRaR-7ljmGVX3w -c config\kraft\server.properties
bin\windows\kafka-server-start.bat config\kraft\server.properties


cd cd softwares\kafka\bin
C:\softwares\kafka>bin\windows\zookeeper-server-start.sh config/zookeeper.properties

List Existing Topics: You can verify the existing topics by running the following command:

to list out all topics 
bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092

to delete the topics 

bin\windows\kafka-topics.bat --delete --topic quickstart-events --bootstrap-server localhost:9092



Create topit :
bin\windows\kafka-topics.bat --create --topic quickstart-events --bootstrap-server localhost:9092

bin\windows\kafka-topics.bat --describe --topic quickstart-events --bootstrap-server localhost:9092

bin\windows\kafka-console-producer.bat --topic quickstart-events --bootstrap-server localhost:9092



consurem

bin\windows\kafka-console-consumer.bat --topic quickstart-events --from-beginning --bootstrap-server localhost:9092





bin\windows\kafka-topics.bat --create --topic cab-locatin --bootstrap-server localhost:9092

