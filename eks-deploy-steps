# EKS Deployment Steps – High Level Overview

## **Phase 1: Prerequisites**
- **Install Tools:**
  - AWS CLI
  - kubectl
  - eksctl
  - Docker
- **Configure AWS Credentials**
- **Create ECR Repositories**
- **Build and Push Docker Images to ECR**

## **Phase 2: Create EKS Cluster**
- **Create EKS Cluster with eksctl** (takes ~15-20 minutes)
- **Verify Cluster & kubectl Connectivity**
- **Install AWS Load Balancer Controller**

## **Phase 3: Kubernetes Manifests**
- **Create Deployment YAMLs:**
  - Eureka Server
  - Product Service
  - Order Service
- **Create Service Definitions for Each Deployment**
- **Create Ingress/ALB Configuration**

## **Phase 4: Deploy Applications**
- **Deploy Eureka Server First**
- **Deploy Product Service**
- **Deploy Order Service**
- **Deploy Ingress/Load Balancer**
- **Verify All Pods Are Running**

## **Phase 5: Configure Load Balancer**
- **Install AWS Load Balancer Controller**
- **Create Application Load Balancer via Ingress**
- **Configure Path-Based Routing**
- **Get ALB DNS Endpoint**

## **Phase 6: Testing**
- **Test Product Service Endpoints via ALB**
- **Test Order Service Endpoints via ALB**
- **Verify Service-to-Service Communication**
- **Check Health Endpoints**

## **Phase 7: Production Setup**
- **Configure Horizontal Pod Autoscaler**
- **Set Up Monitoring (CloudWatch/Prometheus)**
- **Configure Secrets and ConfigMaps**
- **Set Up Logging Aggregation**

## **Phase 8: Optional Enhancements**
- **Set Up CI/CD Pipeline**
- **Configure Blue-Green Deployments**
- **Add RDS Database**
- **Implement Security Best Practices**

## **Phase 9: Cleanup**
- **Delete Kubernetes Resources**
- **Delete EKS Cluster**
- **Clean Up ECR Repositories**
