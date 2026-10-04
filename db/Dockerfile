# Use official MySQL image
FROM mysql/mysql-server:latest

# Working directory inside container
WORKDIR /tmp

# Copy SQL scripts into temp directory
COPY test_db/*.sql /tmp/
COPY test_db/*.dump /tmp/

# Copy base SQL file to auto-execution initialization folder
COPY test_db/employees.sql /docker-entrypoint-initdb.d

# Set root database credentials
ENV MYSQL_ROOT_PASSWORD example
ENV MYSQL_ROOT_HOST=%