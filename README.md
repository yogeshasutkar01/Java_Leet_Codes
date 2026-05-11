git init - Initialize a new Git repository.
git add . - Stage all files for commit.
git commit -m "Initial commit of JavaLeetCodes" - Commit the staged files.
git remote add origin <your-github-repo-url> - Add GitHub as the remote origin (replace <your-github-repo-url> with your actual repo URL).
git push -u origin main - Push the commits to GitHub and set the upstream branch.

//Keep only source files in Git
git status
echo *.class > .gitignore
git add .gitignore
git rm --cached HackerText.class
git commit -m "Ignore compiled Java class files"
git push