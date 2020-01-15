<h3>Getting started</h3>
1. Для запуска приложения необходимо установить rabbitmq, либо запустить docker контeнер комнадой<br>
  docker run -d -h node-1.rabbit                                    <br>
           --name rabbit                                            <br>
           -p "4369:4369"                                           <br>
           -p "5672:5672"                                           <br>
           -p "15672:15672"                                         <br>
           -p "25672:25672"                                         <br>
           -p "35197:35197"                                         <br>
           -e "RABBITMQ_USE_LONGNAME=true"                          <br>
           -e "RABBITMQ_LOGS=/var/log/rabbitmq/rabbit.log"          <br>
           -v /data:/var/lib/rabbitmq <br>
           -v /data/logs:/var/log/rabbitmq <br>
           rabbitmq:3.6.6-management<br>
2. Отправка сообщения происходит с index.html
