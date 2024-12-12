# Navigate into the accounts directory and run Maven install
# shellcheck disable=SC2164
# Define an array containing the folder names
folders=(
  "accounts"
  "cards"
  "configserver"
  "loans"
  "eurekaserver"
)

# Push Docker Image
echo "Start Install Docker image Jar"
for folder in "${folders[@]}"; do
    echo "Executing push image"
    docker image push docker.io/quannguyen1999/$folder:s1
    echo "Done with $folder folder."
done
echo "End Install Docker image Jar"