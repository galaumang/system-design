# Contributing

Contributions are welcome!

**Please carefully read this page to make the code review process go as smoothly as possible.**

## Request or Bug Reports

For any request for system design resources and/or solution or any bug reports, please [submit an issue](https://github.com/galaumang/system-design/issues)

## Pull Requests
The preferred way to contribute is to fork the [`system-design`](https://github.com/galaumang/system-design) main repository on GitHub.

1. Fork the [`system-design`](https://github.com/galaumang/system-design) main repository. Click on the 'Fork' button near the top right corner of the page. This creates a copy of the system-design repository under your account on the GitHub.

2. Navigate to your account and clone that copy to your development box

        $ git clone git@github.com:<username>/system-design.git
        $ cd system-design

3. Create a branch to hold your changes and start making changes. Don't work in the `main` branch!

        $ git checkout -b my-feature

4. Work on this copy on your development box. When you're done editing, run the following to record your changes in Git and push your changes to GitHub:

        $ git add <modified_files>
        $ git commit -m <commit-message>
        
        # Remote push to GitHub
        $ git push -u origin my-feature

5. Finally, go to the web page of your fork of the `system-design` repo and click 'Pull Request' to send your changes for review. Please refer to github documentation on [pull requests](https://help.github.com/articles/using-pull-requests/)