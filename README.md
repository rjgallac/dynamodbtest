

docker compose up -d

aws dynamodb list-tables --endpoint-url http://localhost:8000

aws dynamodb create-table --endpoint-url http://localhost:8000 --table-name Product --attribute-definitions AttributeName=id,AttributeType=S --key-schema AttributeName=id,KeyType=HASH  --provisioned-throughput ReadCapacityUnits=5,WriteCapacityUnits=5 --table-class STANDARD

curl -X POST http://localhost:8080/product

curl http://localhost:8080/product

aws dynamodb scan \
--table-name Product \
--endpoint-url http://localhost:8000

aws dynamodb delete-table --endpoint-url http://localhost:8000 --table-name Product